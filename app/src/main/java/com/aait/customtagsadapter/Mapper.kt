package com.aait.customtagsadapter

abstract class Mapper <Entity>{

    abstract fun mapFromEntity(entity: Entity): Tag

    abstract fun mapToEntity(tag: Tag): Entity

    fun mapFromEntityList(entities: List<Entity>): List<Tag>{
        return entities.map { mapFromEntity(it) }
    }

    fun mapToEntityList(tags: List<Tag>): List<Entity>{
        return tags.map { mapToEntity(it) }
    }
}