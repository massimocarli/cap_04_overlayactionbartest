package uk.co.massimocarli.overlayactionbartest

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  /**
   * Show the ActionBar
   */
  fun showActionBar(view: View) {
    supportActionBar?.show()
  }

  /**
   * Hide the ActionBar
   */
  fun hideActionBar(view: View) {
    supportActionBar?.hide()
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu; this adds items to the action bar if it is present.
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
  }
}
