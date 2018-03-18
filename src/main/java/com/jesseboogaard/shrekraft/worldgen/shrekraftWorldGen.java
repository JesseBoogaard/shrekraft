package com.jesseboogaard.shrekraft.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.fml.common.IWorldGenerator;


public class shrekraftWorldGen extends WorldGenerator implements IWorldGenerator {

    static Random rand2 = new Random();
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {
        int blockX = chunkX * 16;
        int blockZ = chunkZ * 16;

        switch (world.provider.getDimension()) {
            case -1:
                generateNether(world, rand, blockX + 8, blockZ + 8);
                break;
            case 0:
                generateOverworld(world, rand, blockX + 8, blockZ + 8);
                break;
            case 1:
                generateEnd(world, rand, blockX + 8, blockZ + 8);
                break;

        }

    }

    private void generateOverworld(World world, Random rand, int blockX, int blockZ) {
        if ((int) (Math.random() * 100) == 0) {
            int y = getGroundFromAbove(world, blockX, blockZ);
            BlockPos pos = new BlockPos(blockX, y, blockZ);
            WorldGenerator structure = new swampStructGen();
            structure.generate(world, rand, pos);
        }
    }

    private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}


    public static int getGroundFromAbove(World world, int x, int z) {
        int y = 255;
        boolean foundGround = false;
        while(!foundGround && y-- >= 64)
        {
            Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
            foundGround = blockAt == Blocks.GRASS;
        }

        return y;
    }

    public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround) {
        int zwidth = template.getSize().getZ();
        int xwidth = template.getSize().getX();

        // check all the corners to see which ones are replaceable
        boolean corner1 = isCornerValid(world, posAboveGround);
        boolean corner2 = isCornerValid(world, posAboveGround.add(xwidth, 0, zwidth));

        // if Y > 20 and all corners pass the test, it's okay to spawn the structure
        return posAboveGround.getY() > 31 && corner1 && corner2;


    }

    public static boolean isCornerValid(World world, BlockPos pos) {
        int variation = 3;
        int highestBlock = getGroundFromAbove(world, pos.getX(), pos.getZ());

        if (highestBlock > pos.getY() - variation && highestBlock < pos.getY() + variation)
            return true;

        return false;
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        // TODO Auto-generated method stub
        return false;
    }
}
