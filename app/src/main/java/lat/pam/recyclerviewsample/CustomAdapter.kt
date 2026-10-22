package lat.pam.recyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // 1. Membuat/mengubah layout XML item (card_view_design) menjadi bentuk View yang bisa dikelola
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    // 2. Menghubungkan data dari list (berdasarkan posisi/index) ke komponen TextView di item layout
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val itemsViewModel = mList[position]
        holder.textView.text = itemsViewModel.text
    }

    // 3. Mengembalikan total jumlah data yang ada di dalam list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Kelas ViewHolder untuk memegang referensi komponen UI (seperti TextView) agar kinerjanya efisien
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}