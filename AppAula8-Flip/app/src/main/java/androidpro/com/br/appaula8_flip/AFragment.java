package androidpro.com.br.appaula8_flip;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

        Button buttonA = (Button) view.findViewById(R.id.botaoA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity currentActivity = (MainActivity) getActivity();
                currentActivity.showFragmentB();
            }
        });

        return view;
    }

}
