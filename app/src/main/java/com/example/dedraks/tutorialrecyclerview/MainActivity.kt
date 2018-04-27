package com.example.dedraks.tutorialrecyclerview

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    val pessoaList: MutableList<Pessoa> = mutableListOf(
            Pessoa("Adérito Tibiriçá", "atibirica@email.com", "1111-1111"),
            Pessoa("Cleiton Siqueira ", "csiqueira@email.com", "2222-2222"),
            Pessoa("Carlos Proença", "cproenca@email.com", "3333-3333"),
            Pessoa("Filipe Valadão", "fvaladao@email.om", "4444-4444"),
            Pessoa("Flávio Noite", "fnoite@email.com", "5555-5555"),
            Pessoa("Gisela Siebra", "gsiebra@email.com", "6666-6666"),
            Pessoa("Marco Lousã", "mlousa@email.com", "7777-7777"),
            Pessoa("Miriam Tabosa", "mtabosa@email.com", "8888-8888"),
            Pessoa("Rufus Ramírez", "rramirez@email.com", "9999-9999"),
            Pessoa("Socorro Cabreira", "scabreira@email.com", "1010-1010")
    )

    lateinit var pessoaAdapter: PessoaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        pessoaAdapter = PessoaAdapter(this, pessoaList)
        recyclerViewPessoas.adapter = pessoaAdapter
        recyclerViewPessoas.layoutManager = LinearLayoutManager(this)
        recyclerViewPessoas.smoothScrollToPosition(pessoaList.size)
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
}
