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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 新增某条目到目录的请求信息
 *
 * @param subjectId 
 * @param sort 排序条件，越小越靠前
 * @param comment 
 */


data class IndexSubjectAddInfo (

    @Json(name = "subject_id")
    val subjectId: kotlin.Int? = null,

    /* 排序条件，越小越靠前 */
    @Json(name = "sort")
    val sort: kotlin.Int? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null

)

