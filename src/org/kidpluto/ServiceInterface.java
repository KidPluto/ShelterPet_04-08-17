//package org.kidpluto;
//
//@Path("/adopt")
//public interface ServiceInterface {

//    @GET
//    @Path("/application")
//    @Produces(PageAttributes.MediaType.APPLICATION_XML)
//    Response viewCalendar();
//
//    @GET
//    @Path("/application/{animalid}")
//    @Produces(PageAttributes.MediaType.APPLICATION_XML)
//    Response viewMeeting(
//            @PathParam("animalid") int animalid);
//
//    @GET
//    @Path("/attendees/{calendarid}")
//    @Produces(PageAttributes.MediaType.APPLICATION_XML)
//    Response attendeesAvailability(
//            @PathParam("calendarid") int id,
//            @QueryParam("attendees") Set attendees);
//
//    @POST
//    @Path("/create/meeting")
//    @Produces(MediaType.APPLICATION_XML)
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    Response createMeeting(
//            @FormParam("calenderId") int calendarId,
//            @FormParam("start") Date start,
//            @FormParam("finish") Date finish,
//            @FormParam("description") String description,
//            @FormParam("attendees") Set attendees);
//
//    @PUT
//    @Path("/update/meeting")
//    @Produces(MediaType.APPLICATION_XML)
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    Response updateMeeting(
//            @FormParam("calenderId") int calendarId,
//            @FormParam("meetingId") int meetingId,
//            @FormParam("start") Date start,
//            @FormParam("finish") Date finish,
//            @FormParam("description") String description,
//            @FormParam("attendees") Set attendees);
//
//    @PUT
//    @Path("/sync/calendars")
//    @Produces(MediaType.APPLICATION_XML)
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    Response syncCalendars(
//            @FormParam("calenderOneId") int calendarOneId,
//            @FormParam("calendarTwoId") int calendarTwoId);
//}