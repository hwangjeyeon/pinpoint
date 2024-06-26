/*
 * Copyright 2016 Naver Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.web.service.stat;

import com.navercorp.pinpoint.common.server.util.timewindow.TimeWindow;
import com.navercorp.pinpoint.web.vo.stat.chart.StatChart;

import java.util.List;

/**
 * @author HyunGil Jeong
 */
public interface AgentStatChartService<OUT extends StatChart<?>> extends ChartTypeSupport {

    OUT selectAgentChart(String agentId, TimeWindow timeWindow);

    List<OUT> selectAgentChartList(String agentId, TimeWindow timeWindow);

}
