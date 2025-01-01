package com.example.testunitaires.exercice_4

class UserManager {
    private val userList = mutableListOf<String>()

    fun addUser(name: String) {
        userList.add(name)
    }

    fun deleteUser(name: String) {
        userList.remove(name)
    }

    fun updateUser(oldName: String, newName: String) {
        val index = userList.indexOf(oldName)
        if (index != -1) {
            userList[index] = newName
        }
    }

    fun getUsers(): List<String> {
        return userList
    }
}
