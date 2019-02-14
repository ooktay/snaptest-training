environments {
    dev {
        baseUrl {
            about = 'chrome://'
            starWarsApi = 'https://swapi.co/api/'
            countryApi = 'http://services.groupkt.com/'
            countrycode = 'https://countrycode.org/'
            imdb = 'https://www.imdb.com/'
            ergo = 'https://www.ergosigorta.com/'
            sampleWS = 'http://webservices.oorsprong.org/websamples.countryinfo/'
        }
        dbApiUrl = 'http://localhost/api/open/${action}/db'
    }

    test {
    }

    prod {
    }
}
