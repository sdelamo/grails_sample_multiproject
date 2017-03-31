package myapi


import grails.rest.*
import grails.converters.*
import static org.springframework.http.HttpStatus.*

class SaluteController {

    def nameService

    def index() { 
        render text:"Hello ${nameService.name()}", status: OK
    }
}
