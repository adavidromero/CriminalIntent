import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by david on 10-23-15.
 */
public class CrimeFragment extends Fragment{
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
