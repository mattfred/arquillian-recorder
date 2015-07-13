/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arquillian.extension.recorder.video.event;

import org.arquillian.extension.recorder.video.VideoMetaData;
import org.arquillian.extension.recorder.video.VideoType;

/**
 * @author <a href="mailto:smikloso@redhat.com">Stefan Miklosovic</a>
 *
 */
public class StartRecordClassVideo {

    private VideoMetaData videoMetaData;
    private VideoType videoType;

    public StartRecordClassVideo(VideoType videoType, VideoMetaData videoMetaData) {
        this.videoMetaData = videoMetaData;
        this.videoType = videoType;
    }

    public VideoMetaData getVideoMetaData() {
        return videoMetaData;
    }

    public VideoType getVideoType() {
        return videoType;
    }
}
