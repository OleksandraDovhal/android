package com.dovhal.android_labs.android.lab5.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dovhal.android_labs.android.lab5.adapters.RecyclerAdapter
import com.dovhal.android_labs.android.lab5.database.ApplicationDatabase
import com.dovhal.android_labs.android.lab5.database.enities.User
import com.dovhal.android_labs.android.lab5.entities.UserDto
import com.eragoo.cdu_labs.andoroid.lab3.R

class MainActivity : AppCompatActivity() {
    val defaultData = listOf(
        UserDto("Taras", "Schwartz", "taras@gmail.com"),
        UserDto("Ivan", "Ivanchenko", "ivan@gmail.com"),
        UserDto("Petro", "Petrenko", "petrenko@mail.com"),
        UserDto("Ihor", "Ihorovych", "ihor@yahoo.com"),
        UserDto("Oleh", "Oleksiyenko", "oleksiyenko@gmal.com"),
        UserDto("Vasyl", "Vasyliv", "vasyliv@gmail.com"),
        UserDto("Oleksandr", "Oleksandrovych", "Oleksandrovych@gmail.com"),
        UserDto("Andriy", "Andriyiv", "Andriyiv@gmail.com"),
        UserDto("Mykola", "Mykolayiv", "Mykolayiv@gmail.com"),
        UserDto("Vitaliy", "Vitaliyiv", "Vitaliyiv@gmail.com"),
        UserDto("Roman", "Romaniv", "roma@gmail.com"),
        UserDto("Yaroslav", "Yaroslaviv", "yarik@gmail.com"),
        UserDto("Yevhen", "Yevheniv", "eragoo@gmail.com"),
        UserDto("Yuriy", "Yuriyiv", "yuti@ukrnet.ua"),
        UserDto("Dmytro", "Dmytroiv", "dima@gmail.com"),
        UserDto("Taras", "Schwartz", "taras@gmail.com"),
        UserDto("Ivan", "Ivanchenko", "ivan@gmail.com"),
        UserDto("Petro", "Petrenko", "petrenko@mail.com"),
        UserDto("Ihor", "Ihorovych", "ihor@yahoo.com"),
        UserDto("Oleh", "Oleksiyenko", "oleksiyenko@gmal.com")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val db = ApplicationDatabase.getInstance(this)

        fillWithDefaultValues(db);
        val dbUsers = getItemsFromDb(db)

        recyclerView.adapter = RecyclerAdapter(dbUsers)
    }

    private fun fillWithDefaultValues(db: ApplicationDatabase) {
        val userDao = db.userDao()
        defaultData.forEach {
            userDao.insertAll(User(firstName = it.name, lastName = it.surname, email = it.email))
        }
    }

    private fun getItemsFromDb(db: ApplicationDatabase): List<UserDto> {
        return db.userDao().getAll()
            .map { UserDto(it.firstName, it.lastName, it.email) }
    }
}