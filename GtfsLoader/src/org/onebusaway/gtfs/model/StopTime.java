/**
 * Copyright (C) 2011 Brian Ferris <bdferris@onebusaway.org>
 * Copyright (C) 2013 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.gtfs.model;


public final class StopTime extends IdentityBean<Integer> implements
    Comparable<StopTime>, StopTimeProxy {

  private static final long serialVersionUID = 1L;

  public static final int MISSING_VALUE = -999;

  private int id;

  private Trip trip;

  private Stop stop;

  private int arrivalTime = MISSING_VALUE;

  private int departureTime = MISSING_VALUE;
  
  private int timepoint = 0;

  private int stopSequence;

  private String stopHeadsign;

  private String routeShortName;

  private int pickupType;

  private int dropOffType;

  private double shapeDistTraveled = MISSING_VALUE;

  private transient StopTimeProxy proxy = null;

  public StopTime() {

  }

  public StopTime(StopTime st) {
    this.arrivalTime = st.arrivalTime;
    this.departureTime = st.departureTime;
    this.dropOffType = st.dropOffType;
    this.id = st.id;
    this.pickupType = st.pickupType;
    this.routeShortName = st.routeShortName;
    this.shapeDistTraveled = st.shapeDistTraveled;
    this.stop = st.stop;
    this.stopHeadsign = st.stopHeadsign;
    this.stopSequence = st.stopSequence;
    this.timepoint = st.timepoint;
    this.trip = st.trip;
  }

  public Integer getId() {
    if (proxy != null) {
      return proxy.getId();
    }
    return id;
  }

  public void setId(Integer id) {
    if (proxy != null) {
      proxy.setId(id);
      return;
    }
    this.id = id;
  }

  public Trip getTrip() {
    if (proxy != null) {
      return proxy.getTrip();
    }
    return trip;
  }

  public void setTrip(Trip trip) {
    if (proxy != null) {
      proxy.setTrip(trip);
      return;
    }
    this.trip = trip;
  }

  public int getStopSequence() {
    if (proxy != null) {
      return proxy.getStopSequence();
    }
    return stopSequence;
  }

  public void setStopSequence(int stopSequence) {
    if (proxy != null) {
      proxy.setStopSequence(stopSequence);
      return;
    }
    this.stopSequence = stopSequence;
  }

  public Stop getStop() {
    if (proxy != null) {
      return proxy.getStop();
    }
    return stop;
  }

  public void setStop(Stop stop) {
    if (proxy != null) {
      proxy.setStop(stop);
      return;
    }
    this.stop = stop;
  }

  public boolean isArrivalTimeSet() {
    if (proxy != null) {
      return proxy.isArrivalTimeSet();
    }
    return arrivalTime != MISSING_VALUE;
  }

  /**
   * @return arrival time, in seconds since midnight
   */
  public int getArrivalTime() {
    if (proxy != null) {
      return proxy.getArrivalTime();
    }
    return arrivalTime;
  }

  public void setArrivalTime(int arrivalTime) {
    if (proxy != null) {
      proxy.setArrivalTime(arrivalTime);
      return;
    }
    this.arrivalTime = arrivalTime;
  }

  public void clearArrivalTime() {
    if (proxy != null) {
      proxy.clearArrivalTime();
      return;
    }
    this.arrivalTime = MISSING_VALUE;
  }

  public boolean isDepartureTimeSet() {
    if (proxy != null) {
      return proxy.isDepartureTimeSet();
    }
    return departureTime != MISSING_VALUE;
  }

  /**
   * @return departure time, in seconds since midnight
   */
  public int getDepartureTime() {
    if (proxy != null) {
      return proxy.getDepartureTime();
    }
    return departureTime;
  }

  public void setDepartureTime(int departureTime) {
    if (proxy != null) {
      proxy.setDepartureTime(departureTime);
      return;
    }
    this.departureTime = departureTime;
  }

  public void clearDepartureTime() {
    if (proxy != null) {
      proxy.clearDepartureTime();
      return;
    }
    this.departureTime = MISSING_VALUE;
  }
  
  /**
   * @return 1 if the stop-time is a timepoint location
   */
  @Override
  public int getTimepoint() {
    if (proxy != null) {
      return proxy.getTimepoint();
    }
    return timepoint;
  }

  @Override
  public void setTimepoint(int timepoint) {
    if (proxy != null) {
      proxy.setTimepoint(timepoint);
      return;
    }  
    this.timepoint = timepoint;
  }

  public String getStopHeadsign() {
    if (proxy != null) {
      return proxy.getStopHeadsign();
    }
    return stopHeadsign;
  }

  public void setStopHeadsign(String headSign) {
    if (proxy != null) {
      proxy.setStopHeadsign(headSign);
      return;
    }
    this.stopHeadsign = headSign;
  }

  public String getRouteShortName() {
    if (proxy != null) {
      return proxy.getRouteShortName();
    }
    return routeShortName;
  }

  public void setRouteShortName(String routeShortName) {
    if (proxy != null) {
      proxy.setRouteShortName(routeShortName);
      return;
    }
    this.routeShortName = routeShortName;
  }

  public int getPickupType() {
    if (proxy != null) {
      return proxy.getPickupType();
    }
    return pickupType;
  }

  public void setPickupType(int pickupType) {
    if (proxy != null) {
      proxy.setPickupType(pickupType);
    }
    this.pickupType = pickupType;
  }

  public int getDropOffType() {
    if (proxy != null) {
      return proxy.getDropOffType();
    }
    return dropOffType;
  }

  public void setDropOffType(int dropOffType) {
    if (proxy != null) {
      proxy.setDropOffType(dropOffType);
      return;
    }
    this.dropOffType = dropOffType;
  }

  public boolean isShapeDistTraveledSet() {
    if (proxy != null) {
      return proxy.isShapeDistTraveledSet();
    }
    return shapeDistTraveled != MISSING_VALUE;
  }

  public double getShapeDistTraveled() {
    if (proxy != null) {
      return proxy.getShapeDistTraveled();
    }
    return shapeDistTraveled;
  }

  public void setShapeDistTraveled(double shapeDistTraveled) {
    if (proxy != null) {
      proxy.setShapeDistTraveled(shapeDistTraveled);
      return;
    }
    this.shapeDistTraveled = shapeDistTraveled;
  }

  public void clearShapeDistTraveled() {
    if (proxy != null) {
      proxy.clearShapeDistTraveled();
      return;
    }
    this.shapeDistTraveled = MISSING_VALUE;
  }

  public int compareTo(StopTime o) {
    return this.getStopSequence() - o.getStopSequence();
  }

  /**
   * When set, all interactions with this stop time will be redirected through
   * this proxy.
   * 
   * @param proxy
   */
  public void setProxy(StopTimeProxy proxy) {
    this.proxy = proxy;
  }

  public StopTimeProxy getProxy() {
    return proxy;
  }

  @Override
  public String toString() {
    return "StopTime(seq=" + getStopSequence() + " stop=" + getStop().getId()
        + " trip=" + getTrip().getId() + " times="
        + getArrivalTime()
        + "-"
        + getDepartureTime()
        + ")";
  }
}
