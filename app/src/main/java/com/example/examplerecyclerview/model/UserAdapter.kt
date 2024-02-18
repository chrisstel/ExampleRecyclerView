package com.example.examplerecyclerview.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examplerecyclerview.databinding.LayoutItemBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutItemBinding.inflate(inflater, parent, false)

        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = UserProvider.userList[position]

        holder.binding.apply {
            TVUsername.text = "${user.name} ${user.surname}"
        }
    }

    override fun getItemCount(): Int = UserProvider.userList.size

    inner class UserViewHolder(val binding: LayoutItemBinding) : RecyclerView.ViewHolder(binding.root)
}