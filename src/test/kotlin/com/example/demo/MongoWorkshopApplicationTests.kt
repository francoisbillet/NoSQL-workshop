package com.example.demo

import io.kotest.matchers.maps.shouldContainExactly
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.bson.types.ObjectId
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.data.repository.findByIdOrNull

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class MongoWorkshopApplicationTests {

	@Autowired
	lateinit var studyService: StudyService

	@Autowired
	lateinit var studyRepository: StudyRepository

	@Test
	fun `should create study`() {
		val id = ObjectId("673df49073aa53d09cc44dd6")
		studyService.create(Study(id, "My study", "Francisco"))

		studyRepository.findByIdOrNull(id).shouldNotBeNull()
	}

	@Test
	fun `should visit study`() {
		val id = ObjectId("673df49073aa53d09cc44dd6")
		studyRepository.save(Study(id, "My study", "Francisco"))

		studyService.visit(id, "Fabien")

		studyRepository.findByIdOrNull(id)!!.visits shouldContainExactly mapOf("Fabien" to 1)

	}
}
