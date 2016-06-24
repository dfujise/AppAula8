package androidpro.com.br.appaula8_flip;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b, container, false);


        Button buttonB = (Button) view.findViewById(R.id.botaoB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity currentActivity = (MainActivity) getActivity();
                currentActivity.showFragmentA();
            }
        });
        return view;
    }
}
