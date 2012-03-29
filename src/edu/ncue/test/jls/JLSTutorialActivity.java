package edu.ncue.test.jls;

import android.os.Bundle;
import java.util.List;
import android.graphics.drawable.Drawable;
import com.google.android.maps.*;


public class JLSTutorialActivity extends MapActivity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        MapView mv = (MapView) findViewById(R.id.mapview);
        mv.setBuiltInZoomControls(true);
        
        List<Overlay> mapOverlays = mv.getOverlays();
        Drawable drawable = this.getResources().getDrawable(R.drawable.ic_launcher);
        HelloItemizedOverlay itemizedOverlay = new HelloItemizedOverlay(drawable,this);
        GeoPoint point = new GeoPoint(30443769,-91158458);
        OverlayItem overlayitem = new OverlayItem(point, "Laisses Rouler!","I'm in Louisiana");
        
        GeoPoint p2 = new GeoPoint(17385812, 78480667);
        OverlayItem overlayitem2 = new OverlayItem(p2, "Namashkaar!","Im in Hyderabad");
        
        itemizedOverlay.addOverlay(overlayitem);
        itemizedOverlay.addOverlay(overlayitem2);
        
        mapOverlays.add(itemizedOverlay);
    }
    
    @Override
    protected boolean isRouteDisplayed()
    {
    	return false;
    }
}