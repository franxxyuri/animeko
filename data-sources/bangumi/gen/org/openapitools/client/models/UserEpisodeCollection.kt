/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.Episode
import org.openapitools.client.models.EpisodeCollectionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param episode 
 * @param type 
 */


data class UserEpisodeCollection (

    @Json(name = "episode")
    val episode: Episode,

    @Json(name = "type")
    val type: EpisodeCollectionType

)

