package com.example.testunitaires.exercice_2

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.Test

class UserTDDTest {

    private val userManager = UserTDD()

    @Test
    fun addUserToList() {
        userManager.addUser("Yaser")
        assertThat(userManager.getUsers(), hasItem("Yaser"))
    }

    @Test
    fun deleteUserFromList() {
        userManager.addUser("Yaser")
        userManager.deleteUser("Yaser")
        assertThat(userManager.getUsers(), not(hasItem("Yaser")))
    }

    @Test
    fun updateUserName() {
        userManager.addUser("Yaser")
        userManager.updateUser("Yaser", "Hassoune")
        assertThat(userManager.getUsers(), hasItem("Hassoune"))
        assertThat(userManager.getUsers(), not(hasItem("Yaser")))
    }
}
