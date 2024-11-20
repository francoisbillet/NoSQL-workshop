package com.example.demo

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "studies")
data class Study(val id: ObjectId, val name: String, val owner: String, val visits: Map<String, Int> = emptyMap()) {
}
