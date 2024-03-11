'use client';

import { Footer } from 'flowbite-react';
import { BsDribbble, BsFacebook, BsGithub, BsInstagram, BsTwitter } from 'react-icons/bs';
import Image from 'next/image';
import logo from '../../../public/logo.png'

export default function FooterOne() {
  return (
    <Footer container>
      <div className="w-full">
        <div className="grid w-full justify-between sm:flex sm:justify-between md:flex md:grid-cols-1">
          <div>
            <Image 
                src={logo}
                width={180}
                height={180}
                alt="Logotipo Gilson Jose Imóveis"
            />
          </div>
          <div className="grid grid-cols-2 gap-8 sm:mt-4 sm:grid-cols-3 sm:gap-6">
            <div>
              <Footer.Title title="E-mail" />
              <Footer.LinkGroup col>
                <Footer.Link href="#">gilson_jsilva@hotmail.com</Footer.Link>
              </Footer.LinkGroup>
            </div>
            <div>
              <Footer.Title title="Contatos" />
              <Footer.LinkGroup col>
                <Footer.Link href="#">(11) 99907-5659</Footer.Link>
                <Footer.Link href="#">(11) 97148-9495</Footer.Link>
                <Footer.Link href="#">(11) 4496-5932</Footer.Link>
              </Footer.LinkGroup>
            </div>
            <div>
              <Footer.Title title="ONDE ESTAMOS" />
              <Footer.LinkGroup col>
                <Footer.Link href="#">Rua José Marchi, 42, Centro, Itupeva/SP - Brasil</Footer.Link>
                <Footer.Link href="#"><b>CRECI: 55.398</b></Footer.Link>
              </Footer.LinkGroup>
            </div>
          </div>
        </div>
        <Footer.Divider />
        <div className="w-full sm:flex sm:items-center sm:justify-between">
          <Footer.Copyright href="#" by="Gilson José Imóveis™" year={2024} />
          <div className="mt-4 flex space-x-6 sm:mt-0 sm:justify-center">
            <Footer.Icon href="#" icon={BsFacebook} />
            <Footer.Icon href="#" icon={BsInstagram} />
            <Footer.Icon href="#" icon={BsTwitter} />
            <Footer.Icon href="#" icon={BsGithub} />
            <Footer.Icon href="#" icon={BsDribbble} />
          </div>
        </div>
      </div>
    </Footer>
  );
}