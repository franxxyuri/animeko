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
 * 
 *
 * @param id 
 * @param type `0` 本篇，`1` SP，`2` OP，`3` ED
 * @param name 
 * @param nameCn 
 * @param sort 同类条目的排序和集数
 * @param airdate 
 * @param comment 
 * @param duration 维基人填写的原始时长
 * @param desc 简介
 * @param disc 音乐曲目的碟片数
 * @param ep 条目内的集数, 从`1`开始。非本篇剧集的此字段无意义
 * @param durationSeconds 服务器解析的时长，无法解析时为 `0`
 */


data class Episode (

    @Json(name = "id")
    val id: kotlin.Int,

    /* `0` 本篇，`1` SP，`2` OP，`3` ED */
    @Json(name = "type")
    val type: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "name_cn")
    val nameCn: kotlin.String,

    /* 同类条目的排序和集数 */
    @Json(name = "sort")
    val sort: java.math.BigDecimal,

    @Json(name = "airdate")
    val airdate: kotlin.String,

    @Json(name = "comment")
    val comment: kotlin.Int,

    /* 维基人填写的原始时长 */
    @Json(name = "duration")
    val duration: kotlin.String,

    /* 简介 */
    @Json(name = "desc")
    val desc: kotlin.String,

    /* 音乐曲目的碟片数 */
    @Json(name = "disc")
    val disc: kotlin.Int,

    /* 条目内的集数, 从`1`开始。非本篇剧集的此字段无意义 */
    @Json(name = "ep")
    val ep: java.math.BigDecimal? = null,

    /* 服务器解析的时长，无法解析时为 `0` */
    @Json(name = "duration_seconds")
    val durationSeconds: kotlin.Int? = null

)

