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

/**
 * Type of index that wildcard expressions can match.
 */
enum ExpandWildcardOptions {
  /** Match any data stream or index, including hidden ones. */
  all = 0,
  /** Match open, non-hidden indices. Also matches any non-hidden data stream. */
  open = 1,
  /** Match closed, non-hidden indices. Also matches any non-hidden data stream. Data streams cannot be closed. */
  closed = 2,
  /** Match hidden data streams and hidden indices. Must be combined with open, closed, or both. */
  hidden = 3,
  /** Wildcard expressions are not accepted. */
  none = 4
}

export type ExpandWildcards =
  | ExpandWildcardOptions
  | Array<ExpandWildcardOptions>
  | string