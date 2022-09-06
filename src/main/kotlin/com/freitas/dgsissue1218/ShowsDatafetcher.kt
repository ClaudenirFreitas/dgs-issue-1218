package com.freitas.dgsissue1218

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery

@DgsComponent
class ShowsDataFetcher {

    @DgsQuery
    fun shows() = listOf("show01", "show02", "show03", "show04", "show05")

}
