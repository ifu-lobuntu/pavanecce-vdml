# 1. jBPM Designer
## Stencilsets for
###  ActivityNetwork
CapabilityMethod, maps to Case
Activities map to Human Tasks in CMMN
Roles map to CaseRoles, as well as (tentatively) to roles in BusinessNetworks
Let an activity map to a single Capability

### ValueProposition Exchange

### Collaboration Structure
BusinessNetwork
RoleContainment connector


# 2. jBPM Form Modeler

Given above mappings of CMMN elements to VDML elements, the Case creation forms and task forms will need to host an
addition tab for the Measures, calculated or provided, associated with the Task/Case.
CFA will be used to co-ordinate the capturing of values on the Measure form
After case execution, the case initiator would have to also capture measurables
These forms will be very simple, e.g. text fields and dropdowns, but the context for the forms is different which requires
modifications in the FormModeler
ResourceUses are also captured in these forms.


# 3. jBPM Console
Inbox for CFA
Dashboards. Get data from Mondrian, model sets from

# 4. General

On registration, a participant gets to select
1. Roles from Business Networks. This will reduce the number of potential roles in the next step.
2. Roles from Capability Methods
3. Capability Offers from Activities from Capability Methods (Cases) associated with Roles

#4.1. Social Networking
Over time, a particpant may also offer capabilities for CapabilityMethods( cases) that he/she can own. For this selection of
CapabilityMEthods, the participant can then choose preferred collaborators for these roles. These preferred participants will
then become RoleAssignments to roles in the OrgUnit representing the participant. It may be an idea to select these assignments
from Facebook or LinkedIn. The participant can call this role anything, but would have to indicate which Tasks/Activities the roles are
targeting to thus associate Capabilities with the roles.
These potential collaborators will become the default population for role assignment in Cases/Capability Methods, with the caseEngine
doing a matching to Tasks/Activities based on the Capability requirement. However, when
instantiating a CapabilityMethod, the participant can override the role Assignments for that case. And when it comes to execution
time, the Participant can also override it for an individual task/activity

# 5. Query Service
Implement on Mondrian.
Generate star schemas from each MeasurableElement that actually has measuredCharacteristcs
Default dimensions are:
 - Participant
 - Time 
 - CaseFileItem instances selected in the CFA forms as dropdowns (think this through)



Implement a processlistener that sends activity results to the query service



