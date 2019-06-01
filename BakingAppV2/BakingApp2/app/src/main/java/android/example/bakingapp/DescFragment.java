package android.example.bakingapp;

import android.example.bakingapp.Data.Steps;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DescFragment extends Fragment {
    TextView textView;
    Steps step=null;

    public DescFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.desc_fragment,container,false);
        textView = rootView.findViewById(R.id.text_view_desc);

        if (step!=null)
            textView.setText(step.getDescription());

        return rootView;
    }
    public void setStep(Steps step){
        this.step=step;
    }

}
