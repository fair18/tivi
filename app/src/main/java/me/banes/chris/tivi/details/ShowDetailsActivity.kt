/*
 * Copyright 2017 Google, Inc.
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

package me.banes.chris.tivi.details

import android.content.Context
import android.content.Intent
import me.banes.chris.tivi.TiviActivity

class ShowDetailsActivity : TiviActivity() {

    companion object {
        private const val KEY_SHOW_ID = "show_id"

        fun createIntent(context: Context, id: Long): Intent {
            val intent = Intent(context, ShowDetailsActivity::class.java)
            intent.putExtra(KEY_SHOW_ID, id)
            return intent
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)

        val showId = intent.getLongExtra(KEY_SHOW_ID, -1L)
        // TODO
    }
}