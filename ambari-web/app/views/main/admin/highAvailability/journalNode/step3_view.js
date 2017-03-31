/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


var App = require('app');

App.ManageJournalNodeWizardStep3View = App.HighAvailabilityWizardStep4View.extend({
  templateName: require('templates/main/admin/highAvailability/journalNode/step3'),
  step3BodyText: function () {
    var nN = this.get('controller.content.activeNN');
    return Em.I18n.t('admin.manageJournalNode.wizard.step3.body').format(this.get('controller.content.hdfsUser'), nN.host_name);
  }.property('controller.content.masterComponentHosts'),

});
