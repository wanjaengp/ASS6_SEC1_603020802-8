package com.example.ass6

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(
                R.id.frameLayout,
                OneFragment()
            ).commit()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        when(item?.itemId) {
            R.id.menu1 -> {
                transaction.replace(R.id.frameLayout,TwoFragment())
                transaction.addToBackStack(null)
                transaction.commit()
                return true }
            R.id.menu2 -> {
                transaction.replace(R.id.frameLayout, ThreeFragment())
                transaction.addToBackStack(null)
                transaction.commit()
                return true }
            else ->  return super.onOptionsItemSelected(item)
        }

    }
}


