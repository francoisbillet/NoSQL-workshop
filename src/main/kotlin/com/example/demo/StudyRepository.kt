package com.example.demo

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface StudyRepository: MongoRepository<Study, ObjectId> {

}
