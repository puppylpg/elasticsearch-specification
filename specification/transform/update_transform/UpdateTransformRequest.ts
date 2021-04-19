/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import { Name } from '@common/common'
import { RequestBase } from '@common/common_abstractions/request/RequestBase'
import { Time } from '@common/common_options/time_unit/Time'
import { TransformDestination } from '@transform/TransformDestination'
import { TransformSource } from '@transform/TransformSource'
import { TransformSyncContainer } from '@transform/TransformSyncContainer'

/**
 * @rest_spec_name transform.update_transform
 * @since 7.5.0
 * @stability TODO
 */
export interface UpdateTransformRequest extends RequestBase {
  path_parts?: {
    transform_id: Name
  }
  query_parameters?: {
    defer_validation?: boolean
  }
  body?: {
    description?: string
    dest?: TransformDestination
    frequency?: Time
    source?: TransformSource
    sync?: TransformSyncContainer
  }
}