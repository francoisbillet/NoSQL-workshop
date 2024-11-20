package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(private val studyService: StudyService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val firstId = studyService.create("Clement's study 1", "Clement").id
        val secondId = studyService.create("Fabien's study 2", "Fabien").id
        val thirdId = studyService.create("Francois' study 3", "Francois").id
        val fourthId = studyService.create("Maxime's study 4", "Maxime").id
        val fifthId = studyService.create("Oussama's study 5", "Oussama").id
        val sixthId = studyService.create("Moustafa's study 6", "Moustafa").id


        studyService.visit(firstId, "Ilya")
        studyService.visit(firstId, "Oussama")
        studyService.visit(firstId, "Christophe")
        studyService.visit(firstId, "Moustafa")
        studyService.visit(firstId, "Omar")
        studyService.visit(firstId, "Christophe")
        studyService.visit(firstId, "Ilya")
        studyService.visit(firstId, "Moustafa")
        studyService.visit(firstId, "Mohamed")
        studyService.visit(firstId, "Christophe")
        studyService.visit(firstId, "Mohamed")
        studyService.visit(firstId, "Christophe")
        studyService.visit(firstId, "Ilya")
        studyService.visit(firstId, "Moustafa")


        studyService.visit(secondId, "Ilya")
        studyService.visit(secondId, "Clement")
        studyService.visit(secondId, "Francois")
        studyService.visit(secondId, "Oussama")
        studyService.visit(secondId, "Christophe")
        studyService.visit(secondId, "Moustafa")
        studyService.visit(secondId, "Omar")
        studyService.visit(secondId, "Francois")
        studyService.visit(secondId, "Ilya")
        studyService.visit(secondId, "Moustafa")
        studyService.visit(secondId, "Mohamed")
        studyService.visit(secondId, "Clement")
        studyService.visit(secondId, "Francois")
        studyService.visit(secondId, "Clement")
        studyService.visit(secondId, "Christophe")
        studyService.visit(secondId, "Ilya")
        studyService.visit(secondId, "Francois")
        studyService.visit(secondId, "Moustafa")


        studyService.visit(thirdId, "Ilya")
        studyService.visit(thirdId, "Fabien")
        studyService.visit(thirdId, "Francois")
        studyService.visit(thirdId, "Fabien")
        studyService.visit(thirdId, "Christophe")
        studyService.visit(thirdId, "Fabien")
        studyService.visit(thirdId, "Omar")
        studyService.visit(thirdId, "Francois")
        studyService.visit(thirdId, "Ilya")
        studyService.visit(thirdId, "Moustafa")
        studyService.visit(thirdId, "Mohamed")
        studyService.visit(thirdId, "Fabien")
        studyService.visit(thirdId, "Francois")
        studyService.visit(thirdId, "Clement")
        studyService.visit(thirdId, "Christophe")
        studyService.visit(thirdId, "Ilya")
        studyService.visit(thirdId, "Fabien")
        studyService.visit(thirdId, "Fabien")


        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Fabien")
        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Fabien")
        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Fabien")
        studyService.visit(fourthId, "Christophe")
        studyService.visit(fourthId, "Fabien")
        studyService.visit(fourthId, "Fabien")
        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Ilya")
        studyService.visit(fourthId, "Ilya")
        studyService.visit(fourthId, "Moustafa")
        studyService.visit(fourthId, "Moustafa")
        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Fabien")
        studyService.visit(fourthId, "Francois")
        studyService.visit(fourthId, "Clement")
        studyService.visit(fourthId, "Clement")
        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Ilya")
        studyService.visit(fourthId, "Celine")
        studyService.visit(fourthId, "Fabien")




        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Clement")
        studyService.visit(fifthId, "Francois")
        studyService.visit(fifthId, "Francois")
        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Christophe")
        studyService.visit(fifthId, "Christophe")
        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Omar")
        studyService.visit(fifthId, "Francois")
        studyService.visit(fifthId, "Ilya")
        studyService.visit(fifthId, "Ilya")
        studyService.visit(fifthId, "Moustafa")
        studyService.visit(fifthId, "Mohamed")
        studyService.visit(fifthId, "Mohamed")
        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Clement")
        studyService.visit(fifthId, "Clement")
        studyService.visit(fifthId, "Christophe")
        studyService.visit(fifthId, "Christophe")
        studyService.visit(fifthId, "Ilya")
        studyService.visit(fifthId, "Remy")
        studyService.visit(fifthId, "Moustafa")


        studyService.visit(sixthId, "Thierno")
        studyService.visit(sixthId, "Fabien")
        studyService.visit(sixthId, "Francois")
        studyService.visit(sixthId, "Fabien")
        studyService.visit(sixthId, "Thierno")
        studyService.visit(sixthId, "Fabien")
        studyService.visit(sixthId, "Omar")
        studyService.visit(sixthId, "Thierno")
        studyService.visit(sixthId, "Ilya")
        studyService.visit(sixthId, "Moustafa")
        studyService.visit(sixthId, "Mohamed")
        studyService.visit(sixthId, "Fabien")
        studyService.visit(sixthId, "Thierno")
        studyService.visit(sixthId, "Clement")
        studyService.visit(sixthId, "Clement")
        studyService.visit(sixthId, "Christophe")
        studyService.visit(sixthId, "Thierno")
        studyService.visit(sixthId, "Fabien")
        studyService.visit(sixthId, "Fabien")
        studyService.visit(sixthId, "Thierno")
        studyService.visit(sixthId, "Thierno")
    }
}
