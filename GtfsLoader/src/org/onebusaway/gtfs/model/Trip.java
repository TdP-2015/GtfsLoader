/**
 * Copyright (C) 2011 Brian Ferris <bdferris@onebusaway.org>
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


public final class Trip extends IdentityBean<AgencyAndId> {

  private static final long serialVersionUID = 1L;

  private AgencyAndId id;

  private Route route;

  private AgencyAndId serviceId;

  private String tripShortName;

  private String tripHeadsign;

  private String routeShortName;

  private String directionId;

  private String blockId;

  private AgencyAndId shapeId;

  private int wheelchairAccessible = 0;

  @Deprecated
  private int tripBikesAllowed = 0;

  /**
   * 0 = unknown / unspecified, 1 = bikes allowed, 2 = bikes NOT allowed
   */
  private int bikesAllowed = 0;

  public Trip() {

  }

  public Trip(Trip obj) {
    this.id = obj.id;
    this.route = obj.route;
    this.serviceId = obj.serviceId;
    this.tripShortName = obj.tripShortName;
    this.tripHeadsign = obj.tripHeadsign;
    this.routeShortName = obj.routeShortName;
    this.directionId = obj.directionId;
    this.blockId = obj.blockId;
    this.shapeId = obj.shapeId;
    this.wheelchairAccessible = obj.wheelchairAccessible;
    this.tripBikesAllowed = obj.tripBikesAllowed;
    this.bikesAllowed = obj.bikesAllowed;
  }

  public AgencyAndId getId() {
    return id;
  }

  public void setId(AgencyAndId id) {
    this.id = id;
  }

  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public AgencyAndId getServiceId() {
    return serviceId;
  }

  public void setServiceId(AgencyAndId serviceId) {
    this.serviceId = serviceId;
  }

  public String getTripShortName() {
    return tripShortName;
  }

  public void setTripShortName(String tripShortName) {
    this.tripShortName = tripShortName;
  }

  public String getTripHeadsign() {
    return tripHeadsign;
  }

  public void setTripHeadsign(String tripHeadsign) {
    this.tripHeadsign = tripHeadsign;
  }

  public String getRouteShortName() {
    return routeShortName;
  }

  public void setRouteShortName(String routeShortName) {
    this.routeShortName = routeShortName;
  }

  public String getDirectionId() {
    return directionId;
  }

  public void setDirectionId(String directionId) {
    this.directionId = directionId;
  }

  public String getBlockId() {
    return blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }

  public AgencyAndId getShapeId() {
    return shapeId;
  }

  public void setShapeId(AgencyAndId shapeId) {
    this.shapeId = shapeId;
  }

  public void setWheelchairAccessible(int wheelchairAccessible) {
    this.wheelchairAccessible = wheelchairAccessible;
  }

  public int getWheelchairAccessible() {
    return wheelchairAccessible;
  }

  @Deprecated
  public void setTripBikesAllowed(int tripBikesAllowed) {
    this.tripBikesAllowed = tripBikesAllowed;
  }

  @Deprecated
  public int getTripBikesAllowed() {
    return tripBikesAllowed;
  }

  /**
   * @return 0 = unknown / unspecified, 1 = bikes allowed, 2 = bikes NOT allowed
   */
  public int getBikesAllowed() {
    return bikesAllowed;
  }

  /**
   * @param bikesAllowed 0 = unknown / unspecified, 1 = bikes allowed, 2 = bikes
   *          NOT allowed
   */
  public void setBikesAllowed(int bikesAllowed) {
    this.bikesAllowed = bikesAllowed;
  }

  public String toString() {
    return "<Trip " + getId() + ">";
  }

}
