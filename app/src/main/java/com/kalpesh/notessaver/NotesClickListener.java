package com.kalpesh.notessaver;

import androidx.cardview.widget.CardView;

import com.kalpesh.notessaver.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
