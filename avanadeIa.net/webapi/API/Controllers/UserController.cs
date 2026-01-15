
using Microsoft.AspNetCore.Mvc;

namespace webapi.API.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class UserController : ControllerBase
    {
        [HttpGet("GetDateTimeNow")]
        public IActionResult GetDateTime()
        {
            var obj = new
            {
                Data = DateTime.Now.ToLongDateString(),
                Hora = DateTime.Now.ToLongTimeString()
            };
            return Ok(obj);
        }
    }
}