package lat.pam.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Menghubungkan variabel RecyclerView dengan komponen RecyclerView di activity_main.xml berdasarkan ID
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // 2. Mengatur LayoutManager agar item tersusun secara vertikal (berderet ke bawah)
        recyclerview.layoutManager = LinearLayoutManager(this)

        // 3. Membuat ArrayList untuk menampung data dari ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // 4. Perulangan (Looping) untuk membuat 20 data item (Item 1 sampai Item 20)
        for (i in 1..20) {
            data.add(ItemsViewModel("Item $i"))
        }

        // 5. Memasukkan ArrayList data ke dalam CustomAdapter yang sudah dibuat sebelumnya
        val adapter = CustomAdapter(data)

        // Menampilkan log di Logcat untuk memastikan jumlah data
        Log.d("test string", "Jumlah data: " + data.size)

        // 6. Memasang adapter ke RecyclerView agar data siap ditampilkan ke layar
        recyclerview.adapter = adapter
    }
}