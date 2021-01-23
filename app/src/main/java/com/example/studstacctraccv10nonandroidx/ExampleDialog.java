package com.example.studstacctraccv10nonandroidx;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import static java.lang.Integer.parseInt;

public class ExampleDialog extends AppCompatDialogFragment {

    private EditText editTextClassName;
    private EditText editTextProfName;
    private EditText editTextEcts;
    private ExampleDialogListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, null);

        builder.setView(view).setTitle("Add Card").setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String className=editTextClassName.getText().toString();
                String profName=editTextProfName.getText().toString();
                int ects=parseInt(editTextEcts.getText().toString());
                listener.applyText(className,profName,ects);
            }
        });

        editTextClassName = view.findViewById(R.id.edit_className);
        editTextProfName = view.findViewById(R.id.edit_profName);
        editTextEcts = view.findViewById(R.id.editEcts);
        return builder.create();
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        try {
            listener=(ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()+ "must implement ExampleDialogListener");
        }
    }



    public interface ExampleDialogListener{
        void ApplyText(String className, String profName, int ects);

    }


}
