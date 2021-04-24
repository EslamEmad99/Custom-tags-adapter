package com.aait.customtagsadapter

class MyItemMapper : Mapper<MyItem>() {

    override fun mapFromEntity(entity: MyItem): Tag {
        return Tag(
            entity.itemId,
            entity.itemName
        )
    }

    override fun mapToEntity(tag: Tag): MyItem {
        return MyItem(
            tag.id,
            tag.title
        )
    }
}