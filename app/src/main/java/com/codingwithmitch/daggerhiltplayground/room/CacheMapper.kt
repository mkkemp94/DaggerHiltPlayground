package com.codingwithmitch.daggerhiltplayground.room

import com.codingwithmitch.daggerhiltplayground.model.Blog
import com.codingwithmitch.daggerhiltplayground.util.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject
constructor(): EntityMapper<BlogCacheEntity, Blog>
{
    /**
     * Convert from room entity to Domain
     */
    override fun mapFromEntity(entity: BlogCacheEntity): Blog {
        return Blog(
            id = entity.id,
            title = entity.title,
            body = entity.body,
            category = entity.category,
            image = entity.image
        )
    }
    /**
     * Convert from Domain object to room entity
     */
    override fun mapToEntity(domainModel: Blog): BlogCacheEntity {
        return BlogCacheEntity(
            id = domainModel.id,
            title = domainModel.title,
            body = domainModel.body,
            category = domainModel.category,
            image = domainModel.image
        )
    }

    fun mapFromEntityList(entities: List<BlogCacheEntity>): List<Blog> {
        return entities.map { mapFromEntity(it) }
    }
}