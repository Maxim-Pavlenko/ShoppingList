package com.example.shoppinglist.domain

class GetShopItemByIDUseCase(private val shopListRepository: ShopListRepository) {
     suspend fun getShopItem(shopItemId: Int): ShopItem {
         return shopListRepository.getShopItem(shopItemId = shopItemId)
     }
}