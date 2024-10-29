package com.example.list

// EmailAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.bind(email)
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val senderIcon: TextView = itemView.findViewById(R.id.tvSenderIcon)
        private val senderName: TextView = itemView.findViewById(R.id.tvSenderName)
        private val emailSubject: TextView = itemView.findViewById(R.id.tvEmailSubject)
        private val emailSnippet: TextView = itemView.findViewById(R.id.tvEmailSnippet)
        private val emailTime: TextView = itemView.findViewById(R.id.tvEmailTime)

        fun bind(email: Email) {
            senderIcon.text = email.senderInitial.toString()
            senderName.text = email.senderName
            emailSubject.text = email.subject
            emailSnippet.text = email.snippet
            emailTime.text = email.time
        }
    }
}
