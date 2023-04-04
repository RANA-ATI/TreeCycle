package com.example.treecycle.presentation.forest.data

data class Tree(
    val treeName: String,
    val treeProgress: Int,
    val daysSinceWatered: Int,
)

class ForestTrees {
    fun getPlantedTrees() : List<Tree>{
        return listOf(
            Tree("My First Tree", 23, 4),
            Tree("My Second Tree", 67, 5),
            Tree("My  Third Tree", 78, 6)
        )
    }
}