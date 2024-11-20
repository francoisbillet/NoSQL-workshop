package com.example.demo

import org.bson.types.ObjectId
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class StudyService(private val studyRepository: StudyRepository) {
    fun create(study: Study) = studyRepository.save(study)
    fun create(name: String, owner: String) = create(Study(ObjectId(), name, owner))
    fun visit(id: ObjectId, visitor: String) {
        studyRepository.findByIdOrNull(id)?.let {
            it.copy(visits = it.visits + (visitor to (it.visits[visitor] ?: 0).inc()))
        }?.also {
            studyRepository.save(it)
        }
    }

}
