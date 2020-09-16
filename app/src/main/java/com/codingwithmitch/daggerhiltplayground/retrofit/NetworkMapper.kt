package com.codingwithmitch.daggerhiltplayground.retrofit

import com.codingwithmitch.daggerhiltplayground.model.Blog
import com.codingwithmitch.daggerhiltplayground.util.EntityMapper
import javax.inject.Inject

class NetworkMapper
@Inject
constructor() : EntityMapper<BlogNetworkEntity, Blog>
{
    /**
     * Takes in a BlogNetworkEntity (retrofit object) and converts it to a Blog (domain object)
     */
    override fun mapFromEntity(entity: BlogNetworkEntity): Blog {
        return Blog(
            id = entity.id,
            title = entity.title,
            body = entity.body,
            image = entity.image,
            category = entity.category
        )
    }

    /**
     * Takes in a Blog (domain object) and converts it to a BlogNetworkEntity (retrofit object)
     */
    override fun mapToEntity(domainModel: Blog): BlogNetworkEntity {
        return BlogNetworkEntity(
            id = domainModel.id,
            title = domainModel.title,
            body = domainModel.body,
            image = domainModel.image,
            category = domainModel.category
        )
    }

    /**
     * Takes in a list of BlogNetworkEntity objects (retrofit) abd converts them to a list of Blog objects (domain)
     */
    fun mapFromEntityList(entities: List<BlogNetworkEntity>): List<Blog> {
        return entities.map { mapFromEntity(it) }
    }
}