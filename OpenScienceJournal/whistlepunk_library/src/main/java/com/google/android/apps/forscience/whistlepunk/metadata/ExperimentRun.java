/*
 *  Copyright 2016 Google Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.google.android.apps.forscience.whistlepunk.metadata;

import com.google.android.apps.forscience.whistlepunk.data.nano.GoosciSensorLayout;
import com.google.android.apps.forscience.whistlepunk.filemetadata.Trial;
import java.util.List;

@Deprecated
public class ExperimentRun {
  private Trial trial;
  private String experimentId;

  private ExperimentRun(Trial trial, String experimentId, CropHelper.CropLabels unused) {
    this.trial = trial;
    this.experimentId = experimentId;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public long getFirstTimestamp() {
    return trial.getFirstTimestamp();
  }

  public List<String> getSensorIds() {
    return trial.getSensorIds();
  }

  public String getTrialId() {
    return trial.getTrialId();
  }

  public boolean isArchived() {
    return trial.isArchived();
  }

  public void setArchived(boolean isArchived) {
    trial.setArchived(isArchived);
  }

  public Trial getTrial() {
    return trial;
  }

  public List<GoosciSensorLayout.SensorLayout> getSensorLayouts() {
    return trial.getSensorLayouts();
  }
}
