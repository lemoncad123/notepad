package com.example.notepad

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Note
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.notepad.Listener.Listener
import com.example.notepad.ViewModel.NoteViewModel
import com.example.notepad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Listener {

    private lateinit var rvNotes: RecyclerView
    private lateinit var noteViewModel: NoteViewModel
    private lateinit var noteList: ArrayList<Note>
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar  = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        rvNotes



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onClickListener(position: Int) {

        //To do not implemented yet
    }


}