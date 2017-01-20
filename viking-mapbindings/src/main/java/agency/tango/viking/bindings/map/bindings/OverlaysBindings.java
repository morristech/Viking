package agency.tango.viking.bindings.map.bindings;

import android.databinding.BindingAdapter;

import java.util.Collection;

import agency.tango.viking.bindings.map.GoogleMapView;
import agency.tango.viking.bindings.map.listeners.ItemClickListener;
import agency.tango.viking.bindings.map.models.BindableOverlay;

public class OverlaysBindings {
  private OverlaysBindings() {
  }

  @BindingAdapter("gmv_groundOverlays")
  public static void setGroundOverlays(GoogleMapView googleMapView,
      Collection<BindableOverlay> groundOverlay) {
    if (groundOverlay == null) {
      return;
    }

    googleMapView.groundOverlays(groundOverlay);
  }

  @BindingAdapter("gmv_groundOverlayClickListener")
  public static void onGroundOverlayClickListener(GoogleMapView googleMapView,
      ItemClickListener<BindableOverlay> itemClickListener) {
    googleMapView.setOnGroundOverlayClickListener(itemClickListener);
  }
}