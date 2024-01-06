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

import org.openapitools.client.models.RevisionExtra

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param infobox 
 * @param summary 
 * @param name 
 * @param extra 
 */


data class CharacterRevisionDataItem (

    @Json(name = "infobox")
    val infobox: kotlin.String,

    @Json(name = "summary")
    val summary: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "extra")
    val extra: RevisionExtra

)

