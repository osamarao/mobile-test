package me.osama.goeuromobiletest.models;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;
import com.google.maps.android.SphericalUtil;

/**
 * Created by Osama Rao on 4/19/2015.
 */
public class Places {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;

    @SerializedName("_id")
    private Integer Id;

    private String name;

    private String fullName;

    @SerializedName("iata_airport_code")
    private String iataAirportCode;

    private String type;

    private String country;

    @SerializedName("geo_position")
    private GeoPosition geoPosition;

    private Object locationId;

    private Boolean inEurope;

    private String countryCode;

    private Boolean coreCountry;

    private long distance;



    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {

        this.Id = Id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    public Object getLocationId() {
        return locationId;
    }


    public void setLocationId(Object locationId) {
        this.locationId = locationId;
    }


    public Boolean getInEurope() {
        return inEurope;
    }


    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    public Boolean getCoreCountry() {
        return coreCountry;
    }


    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }


    public double getDistance(LatLng currentLocation) {
        return SphericalUtil.computeDistanceBetween(currentLocation, this.getLatLng());
    }

    private LatLng getLatLng() {
        return new LatLng(getGeoPosition().latitude, getGeoPosition().longitude);
    }


    public void setDistance(Long distance) {

        this.distance = distance;
    }


    @Override
    public String toString() {
        return "name='" + fullName + '\'';
    }

    public class GeoPosition {
        private Double latitude;

        private Double longitude;

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {

            return longitude;
        }

        public void setLongitude(Double longitude) {

            this.longitude = longitude;
        }

        public LatLng getLatLong() {
            return new LatLng(this.latitude, this.longitude);
        }

    }
}
