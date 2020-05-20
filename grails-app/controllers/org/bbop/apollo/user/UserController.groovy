package org.bbop.apollo.user


import grails.rest.*
import grails.converters.*
import org.springframework.http.HttpStatus

class UserController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UserController() {
        super(User)
    }

//    @Override
//    def create() {
//        try {
//            log.info "Creating user"
//            JSONObject dataObject = permissionService.handleInput(request, params)
//            // allow instructor to create user
//            if (!permissionService.hasGlobalPermissions(dataObject, GlobalPermissionEnum.INSTRUCTOR)) {
//                render status: HttpStatus.UNAUTHORIZED
//                return
//            }
//            if (User.findByUsername(dataObject.email) != null) {
//                JSONObject error = new JSONObject()
//                error.put(FeatureStringEnum.ERROR.value, "User already exists. Please enter a new username")
//                render error.toString()
//                return
//            }
//
//            User user = new User(
//                firstName: dataObject.firstName
//                , lastName: dataObject.lastName
//                , username: dataObject.email
//                // set metadata got from dataObject, need to convert to String
//                , metadata: dataObject.metadata ? dataObject.metadata.toString() : null
//                , passwordHash: new Sha256Hash(dataObject.newPassword ?: dataObject.password).toHex()
//            )
//            user.save(insert: true)
//            // to support webservice, get current user from session or input object
//            def currentUser = permissionService.getCurrentUser(dataObject)
//            // allow specify the metadata creator through webservice, if not specified, take current user as the creator
//            if (!user.getMetaData(FeatureStringEnum.CREATOR.value)) {
//                log.debug "creator does not exist, set current user as the creator"
//                user.addMetaData(FeatureStringEnum.CREATOR.value, currentUser.id.toString())
//            }
//            String roleString = dataObject.role ?: GlobalPermissionEnum.USER.name()
//            Role role = Role.findByName(roleString.toUpperCase())
//            if (!role) {
//                role = Role.findByName(GlobalPermissionEnum.USER.name())
//            }
//            log.debug "adding role: ${role}"
//            user.addToRoles(role)
//            role.addToUsers(user)
//            role.save()
//            user.save(flush: true)
//
//            log.info "Added user ${user.username} with role ${role.name}"
//
//            render new JSONObject() as JSON
//        } catch (e) {
//            log.error(e.fillInStackTrace())
//            JSONObject jsonObject = new JSONObject()
//            jsonObject.put(FeatureStringEnum.ERROR.value, "Failed to add the user " + e.message)
//            render jsonObject as JSON
//        }
//
//    }
}
