package com.example.shoppinglist.domain

import javax.inject.Inject

class GetShopItemByIDUseCase @Inject constructor(
    private val shopListRepository: ShopListRepository
) {
     suspend fun getShopItem(shopItemId: Int): ShopItem {
         return shopListRepository.getShopItem(shopItemId = shopItemId)
     }
}